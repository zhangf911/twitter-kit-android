package com.twitter.sdk.android.core.models;

import com.twitter.sdk.android.core.TwitterAndroidTestCase;

import com.google.gson.Gson;

import java.io.IOException;

public class EntityTest extends TwitterAndroidTestCase {

    private static final String TEST_JSON = "{\"indices\":[32,36]}";
    private static final int TEST_INDICES_START = 32;
    private static final int TEST_INDICES_END = 36;

    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    // TODO: Add tests for serialization if this model will be used for serialization.

    public void testDeserialization() throws IOException {
        final Entity entity = gson.fromJson(TEST_JSON, Entity.class);
        assertEquals(TEST_INDICES_START, entity.getStart());
        assertEquals(TEST_INDICES_END, entity.getEnd());
    }
}