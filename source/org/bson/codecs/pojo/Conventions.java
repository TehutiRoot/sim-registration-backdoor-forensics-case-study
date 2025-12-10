package org.bson.codecs.pojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Conventions {
    public static final Convention ANNOTATION_CONVENTION;
    public static final Convention CLASS_AND_PROPERTY_CONVENTION;
    public static final List<Convention> DEFAULT_CONVENTIONS;
    public static final List<Convention> NO_CONVENTIONS;
    public static final Convention OBJECT_ID_GENERATORS;
    public static final Convention SET_PRIVATE_FIELDS_CONVENTION;
    public static final Convention USE_GETTERS_FOR_SETTERS;

    static {
        C13051oy c13051oy = new C13051oy();
        CLASS_AND_PROPERTY_CONVENTION = c13051oy;
        C12921a c12921a = new C12921a();
        ANNOTATION_CONVENTION = c12921a;
        SET_PRIVATE_FIELDS_CONVENTION = new C13219qy();
        USE_GETTERS_FOR_SETTERS = new C13879ry();
        C13150py c13150py = new C13150py();
        OBJECT_ID_GENERATORS = c13150py;
        DEFAULT_CONVENTIONS = Collections.unmodifiableList(Arrays.asList(c13051oy, c12921a, c13150py));
        NO_CONVENTIONS = Collections.emptyList();
    }
}
