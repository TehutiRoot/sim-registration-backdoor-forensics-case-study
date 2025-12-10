package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p001v4.p002os.IResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C1988a();

    /* renamed from: a */
    public final boolean f8720a;

    /* renamed from: b */
    public final Handler f8721b;

    /* renamed from: c */
    public IResultReceiver f8722c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    public class C1988a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    public class BinderC1989b extends IResultReceiver.Stub {
        public BinderC1989b() {
        }

        @Override // android.support.p001v4.p002os.IResultReceiver
        public void send(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f8721b;
            if (handler != null) {
                handler.post(new RunnableC1990c(i, bundle));
            } else {
                resultReceiver.onReceiveResult(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    public class RunnableC1990c implements Runnable {

        /* renamed from: a */
        public final int f8724a;

        /* renamed from: b */
        public final Bundle f8725b;

        public RunnableC1990c(int i, Bundle bundle) {
            this.f8724a = i;
            this.f8725b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.onReceiveResult(this.f8724a, this.f8725b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f8720a = true;
        this.f8721b = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.f8720a) {
            Handler handler = this.f8721b;
            if (handler != null) {
                handler.post(new RunnableC1990c(i, bundle));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.f8722c;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f8722c == null) {
                    this.f8722c = new BinderC1989b();
                }
                parcel.writeStrongBinder(this.f8722c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f8720a = false;
        this.f8721b = null;
        this.f8722c = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}