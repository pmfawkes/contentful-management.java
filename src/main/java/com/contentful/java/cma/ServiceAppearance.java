package com.contentful.java.cma;

import com.contentful.java.cma.model.CMAAppearance;
import retrofit.http.*;

public interface ServiceAppearance {

    @GET("/spaces/{space}/content_types/{content_type}/editor_interfaces/default")
    CMAAppearance fetchOne(
            @Path("space") String spaceId,
            @Path("content_type") String contentTypeId);

    @PUT("/spaces/{space}/content_types/{content_type}/editor_interfaces/default")
    CMAAppearance update(
            @Header("X-Contentful-Version") Integer version,
            @Path("space") String spaceId,
            @Path("content_type") String contentTypeId,
            @Body CMAAppearance resource);
}
