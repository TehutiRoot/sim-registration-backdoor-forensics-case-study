package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes3.dex */
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: a */
    public final int f45295a;

    /* renamed from: b */
    public final long f45296b;

    /* renamed from: c */
    public final int f45297c;

    /* renamed from: d */
    public final String f45298d;

    /* renamed from: e */
    public final String f45299e;

    /* renamed from: f */
    public final String f45300f;

    /* renamed from: g */
    public final int f45301g;

    /* renamed from: h */
    public final List f45302h;

    /* renamed from: i */
    public final String f45303i;

    /* renamed from: j */
    public final long f45304j;

    /* renamed from: k */
    public final int f45305k;

    /* renamed from: l */
    public final String f45306l;

    /* renamed from: m */
    public final float f45307m;

    /* renamed from: n */
    public final long f45308n;

    /* renamed from: o */
    public final boolean f45309o;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f45295a = i;
        this.f45296b = j;
        this.f45297c = i2;
        this.f45298d = str;
        this.f45299e = str3;
        this.f45300f = str5;
        this.f45301g = i3;
        this.f45302h = list;
        this.f45303i = str2;
        this.f45304j = j2;
        this.f45305k = i4;
        this.f45306l = str4;
        this.f45307m = f;
        this.f45308n = j3;
        this.f45309o = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45295a);
        SafeParcelWriter.writeLong(parcel, 2, this.f45296b);
        SafeParcelWriter.writeString(parcel, 4, this.f45298d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f45301g);
        SafeParcelWriter.writeStringList(parcel, 6, this.f45302h, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f45304j);
        SafeParcelWriter.writeString(parcel, 10, this.f45299e, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f45297c);
        SafeParcelWriter.writeString(parcel, 12, this.f45303i, false);
        SafeParcelWriter.writeString(parcel, 13, this.f45306l, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f45305k);
        SafeParcelWriter.writeFloat(parcel, 15, this.f45307m);
        SafeParcelWriter.writeLong(parcel, 16, this.f45308n);
        SafeParcelWriter.writeString(parcel, 17, this.f45300f, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f45309o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f45297c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f45296b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzc() {
        String join;
        List list = this.f45302h;
        String str = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i = this.f45305k;
        String str2 = this.f45299e;
        String str3 = this.f45306l;
        float f = this.f45307m;
        String str4 = this.f45300f;
        int i2 = this.f45301g;
        String str5 = this.f45298d;
        boolean z = this.f45309o;
        StringBuilder sb = new StringBuilder();
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(str5);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(i2);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(join);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(i);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(f);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        if (str4 != null) {
            str = str4;
        }
        sb.append(str);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(z);
        return sb.toString();
    }
}