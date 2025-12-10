package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.datepicker.AbstractC6933a;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6933a extends TextWatcherAdapter {

    /* renamed from: a */
    public final TextInputLayout f49858a;

    /* renamed from: b */
    public final DateFormat f49859b;

    /* renamed from: c */
    public final CalendarConstraints f49860c;

    /* renamed from: d */
    public final String f49861d;

    /* renamed from: e */
    public final Runnable f49862e;

    /* renamed from: f */
    public Runnable f49863f;

    public AbstractC6933a(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f49859b = dateFormat;
        this.f49858a = textInputLayout;
        this.f49860c = calendarConstraints;
        this.f49861d = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f49862e = new Runnable() { // from class: MD
            {
                AbstractC6933a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6933a.m44831b(AbstractC6933a.this, str);
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m44832a(AbstractC6933a abstractC6933a, long j) {
        abstractC6933a.m44829d(j);
    }

    /* renamed from: b */
    public static /* synthetic */ void m44831b(AbstractC6933a abstractC6933a, String str) {
        abstractC6933a.m44828e(str);
    }

    /* renamed from: c */
    public final Runnable m44830c(final long j) {
        return new Runnable() { // from class: ND
            {
                AbstractC6933a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6933a.m44832a(AbstractC6933a.this, j);
            }
        };
    }

    /* renamed from: d */
    public final /* synthetic */ void m44829d(long j) {
        this.f49858a.setError(String.format(this.f49861d, m44824i(AbstractC1521VD.m65900c(j))));
        mo44827f();
    }

    /* renamed from: e */
    public final /* synthetic */ void m44828e(String str) {
        TextInputLayout textInputLayout = this.f49858a;
        DateFormat dateFormat = this.f49859b;
        Context context = textInputLayout.getContext();
        String string = context.getString(R.string.mtrl_picker_invalid_format);
        String format = String.format(context.getString(R.string.mtrl_picker_invalid_format_use), m44824i(str));
        String format2 = String.format(context.getString(R.string.mtrl_picker_invalid_format_example), m44824i(dateFormat.format(new Date(AbstractC22545v02.m1135o().getTimeInMillis()))));
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        mo44827f();
    }

    /* renamed from: f */
    public abstract void mo44827f();

    /* renamed from: g */
    public abstract void mo44826g(Long l);

    /* renamed from: h */
    public void m44825h(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    /* renamed from: i */
    public final String m44824i(String str) {
        return str.replace(TokenParser.f74560SP, Typography.nbsp);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f49858a.removeCallbacks(this.f49862e);
        this.f49858a.removeCallbacks(this.f49863f);
        this.f49858a.setError(null);
        mo44826g(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.f49859b.parse(charSequence.toString());
            this.f49858a.setError(null);
            long time = parse.getTime();
            if (this.f49860c.getDateValidator().isValid(time) && this.f49860c.m44927m(time)) {
                mo44826g(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable m44830c = m44830c(time);
            this.f49863f = m44830c;
            m44825h(this.f49858a, m44830c);
        } catch (ParseException unused) {
            m44825h(this.f49858a, this.f49862e);
        }
    }
}
