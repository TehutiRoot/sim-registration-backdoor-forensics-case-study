package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public class Dimension {

    /* renamed from: a */
    public final int f32349a;

    /* renamed from: b */
    public int f32350b;

    /* renamed from: c */
    public int f32351c;

    /* renamed from: d */
    public float f32352d;

    /* renamed from: e */
    public int f32353e;

    /* renamed from: f */
    public String f32354f;

    /* renamed from: g */
    public Object f32355g;

    /* renamed from: h */
    public boolean f32356h;
    public static final Object FIXED_DIMENSION = new Object();
    public static final Object WRAP_DIMENSION = new Object();
    public static final Object SPREAD_DIMENSION = new Object();
    public static final Object PARENT_DIMENSION = new Object();
    public static final Object PERCENT_DIMENSION = new Object();
    public static final Object RATIO_DIMENSION = new Object();

    /* loaded from: classes2.dex */
    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f32349a = -2;
        this.f32350b = 0;
        this.f32351c = Integer.MAX_VALUE;
        this.f32352d = 1.0f;
        this.f32353e = 0;
        this.f32354f = null;
        this.f32355g = WRAP_DIMENSION;
        this.f32356h = false;
    }

    public static Dimension Fixed(int i) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(i);
        return dimension;
    }

    public static Dimension Parent() {
        return new Dimension(PARENT_DIMENSION);
    }

    public static Dimension Percent(Object obj, float f) {
        Dimension dimension = new Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f);
        return dimension;
    }

    public static Dimension Ratio(String str) {
        Dimension dimension = new Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public static Dimension Spread() {
        return new Dimension(SPREAD_DIMENSION);
    }

    public static Dimension Suggested(int i) {
        Dimension dimension = new Dimension();
        dimension.suggested(i);
        return dimension;
    }

    public static Dimension Wrap() {
        return new Dimension(WRAP_DIMENSION);
    }

    /* renamed from: a */
    public int m58691a() {
        return this.f32353e;
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i) {
        String str = this.f32354f;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.f32356h) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f32355g;
                if (obj == WRAP_DIMENSION) {
                    i2 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i2 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i2, this.f32350b, this.f32351c, this.f32352d);
                return;
            }
            int i3 = this.f32350b;
            if (i3 > 0) {
                constraintWidget.setMinWidth(i3);
            }
            int i4 = this.f32351c;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i4);
            }
            Object obj2 = this.f32355g;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj2 == null) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setWidth(this.f32353e);
            }
        } else if (this.f32356h) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f32355g;
            if (obj3 == WRAP_DIMENSION) {
                i2 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i2 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i2, this.f32350b, this.f32351c, this.f32352d);
        } else {
            int i5 = this.f32350b;
            if (i5 > 0) {
                constraintWidget.setMinHeight(i5);
            }
            int i6 = this.f32351c;
            if (i6 < Integer.MAX_VALUE) {
                constraintWidget.setMaxHeight(i6);
            }
            Object obj4 = this.f32355g;
            if (obj4 == WRAP_DIMENSION) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj4 == PARENT_DIMENSION) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj4 == null) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setHeight(this.f32353e);
            }
        }
    }

    public boolean equalsFixedValue(int i) {
        if (this.f32355g == null && this.f32353e == i) {
            return true;
        }
        return false;
    }

    public Dimension fixed(Object obj) {
        this.f32355g = obj;
        if (obj instanceof Integer) {
            this.f32353e = ((Integer) obj).intValue();
            this.f32355g = null;
        }
        return this;
    }

    public Dimension max(int i) {
        if (this.f32351c >= 0) {
            this.f32351c = i;
        }
        return this;
    }

    public Dimension min(int i) {
        if (i >= 0) {
            this.f32350b = i;
        }
        return this;
    }

    public Dimension percent(Object obj, float f) {
        this.f32352d = f;
        return this;
    }

    public Dimension ratio(String str) {
        this.f32354f = str;
        return this;
    }

    public Dimension suggested(int i) {
        this.f32356h = true;
        if (i >= 0) {
            this.f32351c = i;
        }
        return this;
    }

    public Dimension min(Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.f32350b = -2;
        }
        return this;
    }

    public static Dimension Fixed(Object obj) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static Dimension Suggested(Object obj) {
        Dimension dimension = new Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public Dimension max(Object obj) {
        Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.f32356h) {
            this.f32355g = obj2;
            this.f32351c = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension suggested(Object obj) {
        this.f32355g = obj;
        this.f32356h = true;
        return this;
    }

    public Dimension fixed(int i) {
        this.f32355g = null;
        this.f32353e = i;
        return this;
    }

    public Dimension(Object obj) {
        this.f32349a = -2;
        this.f32350b = 0;
        this.f32351c = Integer.MAX_VALUE;
        this.f32352d = 1.0f;
        this.f32353e = 0;
        this.f32354f = null;
        this.f32356h = false;
        this.f32355g = obj;
    }
}
