package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f32544x;

    /* renamed from: y */
    public int f32545y;

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f32544x;
        if (i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f32545y) && i2 < i3 + this.height) {
            return true;
        }
        return false;
    }

    public int getCenterX() {
        return (this.f32544x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f32545y + this.height) / 2;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f32544x = i;
        this.f32545y = i2;
        this.width = i3;
        this.height = i4;
    }
}
