package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.util.MPLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
/* loaded from: classes5.dex */
public class UpdateDisplayState implements Parcelable {
    public static final Parcelable.Creator<UpdateDisplayState> CREATOR = new C9182a();

    /* renamed from: d */
    public static final ReentrantLock f58669d = new ReentrantLock();

    /* renamed from: e */
    public static long f58670e = -1;

    /* renamed from: f */
    public static UpdateDisplayState f58671f = null;

    /* renamed from: g */
    public static int f58672g = 0;

    /* renamed from: h */
    public static int f58673h = -1;

    /* renamed from: a */
    public final String f58674a;

    /* renamed from: b */
    public final String f58675b;

    /* renamed from: c */
    public final DisplayState f58676c;

    /* loaded from: classes5.dex */
    public static class AnswerMap implements Parcelable {
        public static final Parcelable.Creator<AnswerMap> CREATOR = new C9179a();

        /* renamed from: a */
        public final HashMap f58677a = new HashMap();

        /* renamed from: com.mixpanel.android.mpmetrics.UpdateDisplayState$AnswerMap$a */
        /* loaded from: classes5.dex */
        public static class C9179a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public AnswerMap createFromParcel(Parcel parcel) {
                Bundle bundle = new Bundle(AnswerMap.class.getClassLoader());
                AnswerMap answerMap = new AnswerMap();
                bundle.readFromParcel(parcel);
                for (String str : bundle.keySet()) {
                    answerMap.put(Integer.valueOf(str), bundle.getString(str));
                }
                return answerMap;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public AnswerMap[] newArray(int i) {
                return new AnswerMap[i];
            }
        }

        public boolean contentEquals(AnswerMap answerMap) {
            return this.f58677a.equals(answerMap.f58677a);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String get(Integer num) {
            return (String) this.f58677a.get(num);
        }

        public void put(Integer num, String str) {
            this.f58677a.put(num, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f58677a.entrySet()) {
                bundle.putString(Integer.toString(((Integer) entry.getKey()).intValue()), (String) entry.getValue());
            }
            parcel.writeBundle(bundle);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class DisplayState implements Parcelable {
        public static final Parcelable.Creator<DisplayState> CREATOR = new C9181a();
        public static final String STATE_IMPL_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY";
        public static final String STATE_TYPE_KEY = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY";

        /* loaded from: classes5.dex */
        public static final class InAppNotificationState extends DisplayState {
            public static final String TYPE = "InAppNotificationState";

            /* renamed from: a */
            public final InAppNotification f58680a;

            /* renamed from: b */
            public final int f58681b;
            public static final Parcelable.Creator<InAppNotificationState> CREATOR = new C9180a();

            /* renamed from: c */
            public static String f58678c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";

            /* renamed from: d */
            public static String f58679d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";

            /* renamed from: com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState$a */
            /* loaded from: classes5.dex */
            public static class C9180a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public InAppNotificationState createFromParcel(Parcel parcel) {
                    Bundle bundle = new Bundle(InAppNotificationState.class.getClassLoader());
                    bundle.readFromParcel(parcel);
                    return new InAppNotificationState(bundle, (C9182a) null);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public InAppNotificationState[] newArray(int i) {
                    return new InAppNotificationState[i];
                }
            }

            public /* synthetic */ InAppNotificationState(Bundle bundle, C9182a c9182a) {
                this(bundle);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int getHighlightColor() {
                return this.f58681b;
            }

            public InAppNotification getInAppNotification() {
                return this.f58680a;
            }

            @Override // com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState
            public String getType() {
                return TYPE;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f58678c, this.f58680a);
                bundle.putInt(f58679d, this.f58681b);
                parcel.writeBundle(bundle);
            }

            public InAppNotificationState(InAppNotification inAppNotification, int i) {
                super(null);
                this.f58680a = inAppNotification;
                this.f58681b = i;
            }

            public InAppNotificationState(Bundle bundle) {
                super(null);
                this.f58680a = (InAppNotification) bundle.getParcelable(f58678c);
                this.f58681b = bundle.getInt(f58679d);
            }
        }

        /* renamed from: com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$a */
        /* loaded from: classes5.dex */
        public static class C9181a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DisplayState createFromParcel(Parcel parcel) {
                Bundle bundle = new Bundle(DisplayState.class.getClassLoader());
                bundle.readFromParcel(parcel);
                String string = bundle.getString(DisplayState.STATE_TYPE_KEY);
                Bundle bundle2 = bundle.getBundle(DisplayState.STATE_IMPL_KEY);
                if (InAppNotificationState.TYPE.equals(string)) {
                    return new InAppNotificationState(bundle2, (C9182a) null);
                }
                throw new RuntimeException("Unrecognized display state type " + string);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public DisplayState[] newArray(int i) {
                return new DisplayState[i];
            }
        }

        public /* synthetic */ DisplayState(C9182a c9182a) {
            this();
        }

        public abstract String getType();

        public DisplayState() {
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.UpdateDisplayState$a */
    /* loaded from: classes5.dex */
    public static class C9182a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UpdateDisplayState createFromParcel(Parcel parcel) {
            Bundle bundle = new Bundle(UpdateDisplayState.class.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState(bundle, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UpdateDisplayState[] newArray(int i) {
            return new UpdateDisplayState[i];
        }
    }

    public /* synthetic */ UpdateDisplayState(Bundle bundle, C9182a c9182a) {
        this(bundle);
    }

    /* renamed from: a */
    public static ReentrantLock m33539a() {
        return f58669d;
    }

    /* renamed from: b */
    public static boolean m33538b() {
        if (f58669d.isHeldByCurrentThread()) {
            long currentTimeMillis = System.currentTimeMillis() - f58670e;
            if (f58672g > 0 && currentTimeMillis > 43200000) {
                MPLog.m33455i("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
                f58671f = null;
            }
            if (f58671f != null) {
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static int m33537c(DisplayState displayState, String str, String str2) {
        if (f58669d.isHeldByCurrentThread()) {
            if (!m33538b()) {
                f58670e = System.currentTimeMillis();
                f58671f = new UpdateDisplayState(displayState, str, str2);
                int i = f58672g + 1;
                f58672g = i;
                return i;
            }
            MPLog.m33453v("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        throw new AssertionError();
    }

    public static UpdateDisplayState claimDisplayState(int i) {
        ReentrantLock reentrantLock = f58669d;
        reentrantLock.lock();
        try {
            int i2 = f58673h;
            if (i2 > 0 && i2 != i) {
                reentrantLock.unlock();
                return null;
            } else if (f58671f == null) {
                reentrantLock.unlock();
                return null;
            } else {
                f58670e = System.currentTimeMillis();
                f58673h = i;
                UpdateDisplayState updateDisplayState = f58671f;
                reentrantLock.unlock();
                return updateDisplayState;
            }
        } catch (Throwable th2) {
            f58669d.unlock();
            throw th2;
        }
    }

    public static void releaseDisplayState(int i) {
        ReentrantLock reentrantLock = f58669d;
        reentrantLock.lock();
        try {
            if (i == f58673h) {
                f58673h = -1;
                f58671f = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            f58669d.unlock();
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DisplayState getDisplayState() {
        return this.f58676c;
    }

    public String getDistinctId() {
        return this.f58674a;
    }

    public String getToken() {
        return this.f58675b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", this.f58674a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", this.f58675b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", this.f58676c);
        parcel.writeBundle(bundle);
    }

    public UpdateDisplayState(DisplayState displayState, String str, String str2) {
        this.f58674a = str;
        this.f58675b = str2;
        this.f58676c = displayState;
    }

    public UpdateDisplayState(Bundle bundle) {
        this.f58674a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        this.f58675b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        this.f58676c = (DisplayState) bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }
}
