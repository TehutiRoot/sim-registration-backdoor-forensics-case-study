package com.yarolegovich.discretescrollview.transform;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public class Pivot {
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;

    /* renamed from: a */
    public int f60915a;

    /* renamed from: b */
    public int f60916b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Axis {
    }

    /* renamed from: com.yarolegovich.discretescrollview.transform.Pivot$X */
    /* loaded from: classes5.dex */
    public enum EnumC9988X {
        LEFT { // from class: com.yarolegovich.discretescrollview.transform.Pivot.X.1
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9988X
            public Pivot create() {
                return new Pivot(0, 0);
            }
        },
        CENTER { // from class: com.yarolegovich.discretescrollview.transform.Pivot.X.2
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9988X
            public Pivot create() {
                return new Pivot(0, -1);
            }
        },
        RIGHT { // from class: com.yarolegovich.discretescrollview.transform.Pivot.X.3
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9988X
            public Pivot create() {
                return new Pivot(0, -2);
            }
        };

        public abstract Pivot create();
    }

    /* renamed from: com.yarolegovich.discretescrollview.transform.Pivot$Y */
    /* loaded from: classes5.dex */
    public enum EnumC9992Y {
        TOP { // from class: com.yarolegovich.discretescrollview.transform.Pivot.Y.1
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9992Y
            public Pivot create() {
                return new Pivot(1, 0);
            }
        },
        CENTER { // from class: com.yarolegovich.discretescrollview.transform.Pivot.Y.2
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9992Y
            public Pivot create() {
                return new Pivot(1, -1);
            }
        },
        BOTTOM { // from class: com.yarolegovich.discretescrollview.transform.Pivot.Y.3
            @Override // com.yarolegovich.discretescrollview.transform.Pivot.EnumC9992Y
            public Pivot create() {
                return new Pivot(1, -2);
            }
        };

        public abstract Pivot create();
    }

    public Pivot(int i, int i2) {
        this.f60915a = i;
        this.f60916b = i2;
    }

    public int getAxis() {
        return this.f60915a;
    }

    public void setOn(View view) {
        int i = this.f60915a;
        if (i == 0) {
            int i2 = this.f60916b;
            if (i2 != -2) {
                if (i2 != -1) {
                    view.setPivotX(i2);
                    return;
                } else {
                    view.setPivotX(view.getWidth() * 0.5f);
                    return;
                }
            }
            view.setPivotX(view.getWidth());
        } else if (i == 1) {
            int i3 = this.f60916b;
            if (i3 != -2) {
                if (i3 != -1) {
                    view.setPivotY(i3);
                    return;
                } else {
                    view.setPivotY(view.getHeight() * 0.5f);
                    return;
                }
            }
            view.setPivotY(view.getHeight());
        }
    }
}