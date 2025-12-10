package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.codec.language.p027bm.Languages;

@Deprecated
/* loaded from: classes3.dex */
public class JsonSchema {

    /* renamed from: a */
    public final ObjectNode f43381a;

    @JsonCreator
    public JsonSchema(ObjectNode objectNode) {
        this.f43381a = objectNode;
    }

    public static JsonNode getDefaultSchemaNode() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", Languages.ANY);
        return objectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonSchema)) {
            return false;
        }
        JsonSchema jsonSchema = (JsonSchema) obj;
        ObjectNode objectNode = this.f43381a;
        if (objectNode == null) {
            if (jsonSchema.f43381a == null) {
                return true;
            }
            return false;
        }
        return objectNode.equals(jsonSchema.f43381a);
    }

    @JsonValue
    public ObjectNode getSchemaNode() {
        return this.f43381a;
    }

    public int hashCode() {
        return this.f43381a.hashCode();
    }

    public String toString() {
        return this.f43381a.toString();
    }
}