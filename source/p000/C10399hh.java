package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* renamed from: hh */
/* loaded from: classes4.dex */
public final class C10399hh {

    /* renamed from: a */
    public final C14017tg f62548a;

    /* renamed from: b */
    public final C14017tg f62549b;

    /* renamed from: c */
    public final C14017tg f62550c;

    /* renamed from: d */
    public final C14017tg f62551d;

    /* renamed from: e */
    public final C14017tg f62552e;

    /* renamed from: f */
    public final C14017tg f62553f;

    /* renamed from: g */
    public final C14017tg f62554g;

    /* renamed from: h */
    public final Paint f62555h;

    public C10399hh(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f62548a = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f62554g = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f62549b = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f62550c = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f62551d = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f62552e = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f62553f = C14017tg.m22383a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f62555h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
