package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class BadgeState {

    /* renamed from: a */
    public final State f49063a;

    /* renamed from: b */
    public final State f49064b;

    /* renamed from: c */
    public final float f49065c;

    /* renamed from: d */
    public final float f49066d;

    /* renamed from: e */
    public final float f49067e;

    /* renamed from: f */
    public final float f49068f;

    /* renamed from: g */
    public final float f49069g;

    /* renamed from: h */
    public final float f49070h;

    /* renamed from: i */
    public final float f49071i;

    /* renamed from: j */
    public final int f49072j;

    /* renamed from: k */
    public final int f49073k;

    /* renamed from: l */
    public int f49074l;

    public BadgeState(Context context, int i, int i2, int i3, State state) {
        int i4;
        CharSequence charSequence;
        int i5;
        int i6;
        int i7;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        Locale locale;
        Locale.Category category;
        State state2 = new State();
        this.f49064b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f49075a = i;
        }
        TypedArray m45832b = m45832b(context, state.f49075a, i2, i3);
        Resources resources = context.getResources();
        this.f49065c = m45832b.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f49071i = m45832b.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f49072j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f49073k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f49066d = m45832b.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.f49067e = m45832b.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
        this.f49069g = m45832b.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f49068f = m45832b.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
        this.f49070h = m45832b.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
        boolean z = true;
        this.f49074l = m45832b.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        if (state.f49083i != -2) {
            i4 = state.f49083i;
        } else {
            i4 = 255;
        }
        state2.f49083i = i4;
        if (state.f49087m != null) {
            charSequence = state.f49087m;
        } else {
            charSequence = context.getString(R.string.mtrl_badge_numberless_content_description);
        }
        state2.f49087m = charSequence;
        if (state.f49088n != 0) {
            i5 = state.f49088n;
        } else {
            i5 = R.plurals.mtrl_badge_content_description;
        }
        state2.f49088n = i5;
        if (state.f49089o != 0) {
            i6 = state.f49089o;
        } else {
            i6 = R.string.mtrl_exceed_max_badge_number_content_description;
        }
        state2.f49089o = i6;
        if (state.f49091q != null && !state.f49091q.booleanValue()) {
            z = false;
        }
        state2.f49091q = Boolean.valueOf(z);
        if (state.f49085k != -2) {
            i7 = state.f49085k;
        } else {
            i7 = m45832b.getInt(R.styleable.Badge_maxCharacterCount, 4);
        }
        state2.f49085k = i7;
        if (state.f49084j != -2) {
            state2.f49084j = state.f49084j;
        } else if (m45832b.hasValue(R.styleable.Badge_number)) {
            state2.f49084j = m45832b.getInt(R.styleable.Badge_number, 0);
        } else {
            state2.f49084j = -1;
        }
        if (state.f49079e == null) {
            intValue = m45832b.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = state.f49079e.intValue();
        }
        state2.f49079e = Integer.valueOf(intValue);
        if (state.f49080f == null) {
            intValue2 = m45832b.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            intValue2 = state.f49080f.intValue();
        }
        state2.f49080f = Integer.valueOf(intValue2);
        if (state.f49081g == null) {
            intValue3 = m45832b.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = state.f49081g.intValue();
        }
        state2.f49081g = Integer.valueOf(intValue3);
        if (state.f49082h == null) {
            intValue4 = m45832b.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            intValue4 = state.f49082h.intValue();
        }
        state2.f49082h = Integer.valueOf(intValue4);
        if (state.f49076b == null) {
            intValue5 = m45856A(context, m45832b, R.styleable.Badge_backgroundColor);
        } else {
            intValue5 = state.f49076b.intValue();
        }
        state2.f49076b = Integer.valueOf(intValue5);
        if (state.f49078d == null) {
            intValue6 = m45832b.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = state.f49078d.intValue();
        }
        state2.f49078d = Integer.valueOf(intValue6);
        if (state.f49077c != null) {
            state2.f49077c = state.f49077c;
        } else if (m45832b.hasValue(R.styleable.Badge_badgeTextColor)) {
            state2.f49077c = Integer.valueOf(m45856A(context, m45832b, R.styleable.Badge_badgeTextColor));
        } else {
            state2.f49077c = Integer.valueOf(new TextAppearance(context, state2.f49078d.intValue()).getTextColor().getDefaultColor());
        }
        if (state.f49090p == null) {
            intValue7 = m45832b.getInt(R.styleable.Badge_badgeGravity, 8388661);
        } else {
            intValue7 = state.f49090p.intValue();
        }
        state2.f49090p = Integer.valueOf(intValue7);
        if (state.f49092r == null) {
            intValue8 = m45832b.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        } else {
            intValue8 = state.f49092r.intValue();
        }
        state2.f49092r = Integer.valueOf(intValue8);
        if (state.f49093s == null) {
            intValue9 = m45832b.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        } else {
            intValue9 = state.f49093s.intValue();
        }
        state2.f49093s = Integer.valueOf(intValue9);
        if (state.f49094t == null) {
            intValue10 = m45832b.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.f49092r.intValue());
        } else {
            intValue10 = state.f49094t.intValue();
        }
        state2.f49094t = Integer.valueOf(intValue10);
        if (state.f49095u == null) {
            intValue11 = m45832b.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.f49093s.intValue());
        } else {
            intValue11 = state.f49095u.intValue();
        }
        state2.f49095u = Integer.valueOf(intValue11);
        if (state.f49096v == null) {
            intValue12 = 0;
        } else {
            intValue12 = state.f49096v.intValue();
        }
        state2.f49096v = Integer.valueOf(intValue12);
        state2.f49097w = Integer.valueOf(state.f49097w != null ? state.f49097w.intValue() : 0);
        m45832b.recycle();
        if (state.f49086l != null) {
            state2.f49086l = state.f49086l;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            state2.f49086l = locale;
        }
        this.f49063a = state;
    }

    /* renamed from: A */
    public static int m45856A(Context context, TypedArray typedArray, int i) {
        return MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: B */
    public void m45855B(int i) {
        this.f49063a.f49096v = Integer.valueOf(i);
        this.f49064b.f49096v = Integer.valueOf(i);
    }

    /* renamed from: C */
    public void m45854C(int i) {
        this.f49063a.f49097w = Integer.valueOf(i);
        this.f49064b.f49097w = Integer.valueOf(i);
    }

    /* renamed from: D */
    public void m45853D(int i) {
        this.f49063a.f49083i = i;
        this.f49064b.f49083i = i;
    }

    /* renamed from: E */
    public void m45852E(int i) {
        this.f49063a.f49076b = Integer.valueOf(i);
        this.f49064b.f49076b = Integer.valueOf(i);
    }

    /* renamed from: F */
    public void m45851F(int i) {
        this.f49063a.f49090p = Integer.valueOf(i);
        this.f49064b.f49090p = Integer.valueOf(i);
    }

    /* renamed from: G */
    public void m45850G(int i) {
        this.f49063a.f49080f = Integer.valueOf(i);
        this.f49064b.f49080f = Integer.valueOf(i);
    }

    /* renamed from: H */
    public void m45849H(int i) {
        this.f49063a.f49079e = Integer.valueOf(i);
        this.f49064b.f49079e = Integer.valueOf(i);
    }

    /* renamed from: I */
    public void m45848I(int i) {
        this.f49063a.f49077c = Integer.valueOf(i);
        this.f49064b.f49077c = Integer.valueOf(i);
    }

    /* renamed from: J */
    public void m45847J(int i) {
        this.f49063a.f49082h = Integer.valueOf(i);
        this.f49064b.f49082h = Integer.valueOf(i);
    }

    /* renamed from: K */
    public void m45846K(int i) {
        this.f49063a.f49081g = Integer.valueOf(i);
        this.f49064b.f49081g = Integer.valueOf(i);
    }

    /* renamed from: L */
    public void m45845L(int i) {
        this.f49063a.f49089o = i;
        this.f49064b.f49089o = i;
    }

    /* renamed from: M */
    public void m45844M(CharSequence charSequence) {
        this.f49063a.f49087m = charSequence;
        this.f49064b.f49087m = charSequence;
    }

    /* renamed from: N */
    public void m45843N(int i) {
        this.f49063a.f49088n = i;
        this.f49064b.f49088n = i;
    }

    /* renamed from: O */
    public void m45842O(int i) {
        this.f49063a.f49094t = Integer.valueOf(i);
        this.f49064b.f49094t = Integer.valueOf(i);
    }

    /* renamed from: P */
    public void m45841P(int i) {
        this.f49063a.f49092r = Integer.valueOf(i);
        this.f49064b.f49092r = Integer.valueOf(i);
    }

    /* renamed from: Q */
    public void m45840Q(int i) {
        this.f49063a.f49085k = i;
        this.f49064b.f49085k = i;
    }

    /* renamed from: R */
    public void m45839R(int i) {
        this.f49063a.f49084j = i;
        this.f49064b.f49084j = i;
    }

    /* renamed from: S */
    public void m45838S(Locale locale) {
        this.f49063a.f49086l = locale;
        this.f49064b.f49086l = locale;
    }

    /* renamed from: T */
    public void m45837T(int i) {
        this.f49063a.f49078d = Integer.valueOf(i);
        this.f49064b.f49078d = Integer.valueOf(i);
    }

    /* renamed from: U */
    public void m45836U(int i) {
        this.f49063a.f49095u = Integer.valueOf(i);
        this.f49064b.f49095u = Integer.valueOf(i);
    }

    /* renamed from: V */
    public void m45835V(int i) {
        this.f49063a.f49093s = Integer.valueOf(i);
        this.f49064b.f49093s = Integer.valueOf(i);
    }

    /* renamed from: W */
    public void m45834W(boolean z) {
        this.f49063a.f49091q = Boolean.valueOf(z);
        this.f49064b.f49091q = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void m45833a() {
        m45839R(-1);
    }

    /* renamed from: b */
    public final TypedArray m45832b(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i, "badge");
            i4 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i2, i5, new int[0]);
    }

    /* renamed from: c */
    public int m45831c() {
        return this.f49064b.f49096v.intValue();
    }

    /* renamed from: d */
    public int m45830d() {
        return this.f49064b.f49097w.intValue();
    }

    /* renamed from: e */
    public int m45829e() {
        return this.f49064b.f49083i;
    }

    /* renamed from: f */
    public int m45828f() {
        return this.f49064b.f49076b.intValue();
    }

    /* renamed from: g */
    public int m45827g() {
        return this.f49064b.f49090p.intValue();
    }

    /* renamed from: h */
    public int m45826h() {
        return this.f49064b.f49080f.intValue();
    }

    /* renamed from: i */
    public int m45825i() {
        return this.f49064b.f49079e.intValue();
    }

    /* renamed from: j */
    public int m45824j() {
        return this.f49064b.f49077c.intValue();
    }

    /* renamed from: k */
    public int m45823k() {
        return this.f49064b.f49082h.intValue();
    }

    /* renamed from: l */
    public int m45822l() {
        return this.f49064b.f49081g.intValue();
    }

    /* renamed from: m */
    public int m45821m() {
        return this.f49064b.f49089o;
    }

    /* renamed from: n */
    public CharSequence m45820n() {
        return this.f49064b.f49087m;
    }

    /* renamed from: o */
    public int m45819o() {
        return this.f49064b.f49088n;
    }

    /* renamed from: p */
    public int m45818p() {
        return this.f49064b.f49094t.intValue();
    }

    /* renamed from: q */
    public int m45817q() {
        return this.f49064b.f49092r.intValue();
    }

    /* renamed from: r */
    public int m45816r() {
        return this.f49064b.f49085k;
    }

    /* renamed from: s */
    public int m45815s() {
        return this.f49064b.f49084j;
    }

    /* renamed from: t */
    public Locale m45814t() {
        return this.f49064b.f49086l;
    }

    /* renamed from: u */
    public State m45813u() {
        return this.f49063a;
    }

    /* renamed from: v */
    public int m45812v() {
        return this.f49064b.f49078d.intValue();
    }

    /* renamed from: w */
    public int m45811w() {
        return this.f49064b.f49095u.intValue();
    }

    /* renamed from: x */
    public int m45810x() {
        return this.f49064b.f49093s.intValue();
    }

    /* renamed from: y */
    public boolean m45809y() {
        if (this.f49064b.f49084j != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m45808z() {
        return this.f49064b.f49091q.booleanValue();
    }

    /* loaded from: classes4.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C6809a();

        /* renamed from: a */
        public int f49075a;

        /* renamed from: b */
        public Integer f49076b;

        /* renamed from: c */
        public Integer f49077c;

        /* renamed from: d */
        public Integer f49078d;

        /* renamed from: e */
        public Integer f49079e;

        /* renamed from: f */
        public Integer f49080f;

        /* renamed from: g */
        public Integer f49081g;

        /* renamed from: h */
        public Integer f49082h;

        /* renamed from: i */
        public int f49083i;

        /* renamed from: j */
        public int f49084j;

        /* renamed from: k */
        public int f49085k;

        /* renamed from: l */
        public Locale f49086l;

        /* renamed from: m */
        public CharSequence f49087m;

        /* renamed from: n */
        public int f49088n;

        /* renamed from: o */
        public int f49089o;

        /* renamed from: p */
        public Integer f49090p;

        /* renamed from: q */
        public Boolean f49091q;

        /* renamed from: r */
        public Integer f49092r;

        /* renamed from: s */
        public Integer f49093s;

        /* renamed from: t */
        public Integer f49094t;

        /* renamed from: u */
        public Integer f49095u;

        /* renamed from: v */
        public Integer f49096v;

        /* renamed from: w */
        public Integer f49097w;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        /* loaded from: classes4.dex */
        public class C6809a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.f49083i = 255;
            this.f49084j = -2;
            this.f49085k = -2;
            this.f49091q = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            String charSequence;
            parcel.writeInt(this.f49075a);
            parcel.writeSerializable(this.f49076b);
            parcel.writeSerializable(this.f49077c);
            parcel.writeSerializable(this.f49078d);
            parcel.writeSerializable(this.f49079e);
            parcel.writeSerializable(this.f49080f);
            parcel.writeSerializable(this.f49081g);
            parcel.writeSerializable(this.f49082h);
            parcel.writeInt(this.f49083i);
            parcel.writeInt(this.f49084j);
            parcel.writeInt(this.f49085k);
            CharSequence charSequence2 = this.f49087m;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.f49088n);
            parcel.writeSerializable(this.f49090p);
            parcel.writeSerializable(this.f49092r);
            parcel.writeSerializable(this.f49093s);
            parcel.writeSerializable(this.f49094t);
            parcel.writeSerializable(this.f49095u);
            parcel.writeSerializable(this.f49096v);
            parcel.writeSerializable(this.f49097w);
            parcel.writeSerializable(this.f49091q);
            parcel.writeSerializable(this.f49086l);
        }

        public State(Parcel parcel) {
            this.f49083i = 255;
            this.f49084j = -2;
            this.f49085k = -2;
            this.f49091q = Boolean.TRUE;
            this.f49075a = parcel.readInt();
            this.f49076b = (Integer) parcel.readSerializable();
            this.f49077c = (Integer) parcel.readSerializable();
            this.f49078d = (Integer) parcel.readSerializable();
            this.f49079e = (Integer) parcel.readSerializable();
            this.f49080f = (Integer) parcel.readSerializable();
            this.f49081g = (Integer) parcel.readSerializable();
            this.f49082h = (Integer) parcel.readSerializable();
            this.f49083i = parcel.readInt();
            this.f49084j = parcel.readInt();
            this.f49085k = parcel.readInt();
            this.f49087m = parcel.readString();
            this.f49088n = parcel.readInt();
            this.f49090p = (Integer) parcel.readSerializable();
            this.f49092r = (Integer) parcel.readSerializable();
            this.f49093s = (Integer) parcel.readSerializable();
            this.f49094t = (Integer) parcel.readSerializable();
            this.f49095u = (Integer) parcel.readSerializable();
            this.f49096v = (Integer) parcel.readSerializable();
            this.f49097w = (Integer) parcel.readSerializable();
            this.f49091q = (Boolean) parcel.readSerializable();
            this.f49086l = (Locale) parcel.readSerializable();
        }
    }
}
