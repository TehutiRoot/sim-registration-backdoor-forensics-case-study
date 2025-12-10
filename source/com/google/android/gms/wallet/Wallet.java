package com.google.android.gms.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Wallet {
    @NonNull
    public static final Api<WalletOptions> API;

    /* renamed from: a */
    public static final Api.ClientKey f48842a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f48843b;
    @NonNull
    public static final WalletObjects zza;
    @Deprecated
    public static final com.google.android.gms.internal.wallet.zzv zzb;
    @ShowFirstParty
    public static final com.google.android.gms.internal.wallet.zzad zzc;

    /* loaded from: classes4.dex */
    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {

        /* renamed from: a */
        public final boolean f48844a;
        public final int environment;
        public final int theme;
        @NonNull
        @ShowFirstParty
        public final Account zza;

        /* loaded from: classes4.dex */
        public static final class Builder {

            /* renamed from: a */
            public int f48845a = 3;

            /* renamed from: b */
            public int f48846b = 1;

            /* renamed from: c */
            public boolean f48847c = true;

            @NonNull
            public WalletOptions build() {
                return new WalletOptions(this);
            }

            @NonNull
            public Builder setEnvironment(int i) {
                if (i != 0) {
                    if (i != 0) {
                        if (i != 2 && i != 1 && i != 23 && i != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
                        }
                    } else {
                        i = 0;
                    }
                }
                this.f48845a = i;
                return this;
            }

            @NonNull
            public Builder setTheme(int i) {
                if (i != 0 && i != 1 && i != 2 && i != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i)));
                }
                this.f48846b = i;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder useGoogleWallet() {
                this.f48847c = false;
                return this;
            }
        }

        public WalletOptions(Builder builder) {
            this.environment = builder.f48845a;
            this.theme = builder.f48846b;
            this.f48844a = builder.f48847c;
            this.zza = null;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.f48844a), Boolean.valueOf(walletOptions.f48844a))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        @NonNull
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.f48844a));
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48842a = clientKey;
        C6790a c6790a = new C6790a();
        f48843b = c6790a;
        API = new Api<>("Wallet.API", c6790a, clientKey);
        zzb = new com.google.android.gms.internal.wallet.zzv();
        zza = new com.google.android.gms.internal.wallet.zzaf();
        zzc = new com.google.android.gms.internal.wallet.zzad();
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Activity activity, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    @NonNull
    public static WalletObjectsClient getWalletObjectsClient(@NonNull Activity activity, @Nullable WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Context context, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
