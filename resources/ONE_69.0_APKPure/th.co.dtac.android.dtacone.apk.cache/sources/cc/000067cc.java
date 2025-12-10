package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f32632x;

    /* renamed from: y */
    public int f32633y;

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f32632x;
        if (i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f32633y) && i2 < i3 + this.height) {
            return true;
        }
        return false;
    }

    public int getCenterX() {
        return (this.f32632x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f32633y + this.height) / 2;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f32632x = i;
        this.f32633y = i2;
        this.width = i3;
        this.height = i4;
    }
}