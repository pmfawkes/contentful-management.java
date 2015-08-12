package com.contentful.java.cma;

import com.contentful.java.cma.model.CMAAppearance;
import retrofit.RestAdapter;

import java.util.concurrent.Executor;

public class ModuleAppearances extends AbsModule<ServiceAppearance> {

    ModuleAppearances(RestAdapter restAdapter, Executor callbackExecutor) {
        super(restAdapter, callbackExecutor);
    }

    @Override
    protected ServiceAppearance createService(RestAdapter restAdapter) {
        return restAdapter.create(ServiceAppearance.class);
    }

    public CMAAppearance fetchOne(String spaceId, String contentTypeId) {
        assertNotNull(spaceId, "spaceId");
        assertNotNull(contentTypeId, "contentTypeId");
        return service.fetchOne(spaceId, contentTypeId);
    }

    public CMAAppearance update(CMAAppearance appearance) {
        assertNotNull(appearance, "appearance");
        assertNotNull(appearance.getTitle(), "appearance.title");
        assertNotNull(appearance.getContentTypeId(), "appearance.contentType");
        String spaceId = getSpaceIdOrThrow(appearance, "appearance");
        Integer version = getVersionOrThrow(appearance, "update");
        String contentTypeId = appearance.getContentTypeId();
        return service.update(version, spaceId, contentTypeId, appearance);
    }
}
