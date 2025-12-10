package com.chuckerteam.chucker.internal.data.har;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.har.log.Creator;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/Har;", "", "Lcom/chuckerteam/chucker/internal/data/har/Log;", "log", "<init>", "(Lcom/chuckerteam/chucker/internal/data/har/Log;)V", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "creator", "(Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/Creator;)V", "component1", "()Lcom/chuckerteam/chucker/internal/data/har/Log;", "copy", "(Lcom/chuckerteam/chucker/internal/data/har/Log;)Lcom/chuckerteam/chucker/internal/data/har/Har;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/internal/data/har/Log;", "getLog", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Har {
    @SerializedName("log")
    @NotNull

    /* renamed from: a */
    private final Log f42805a;

    public Har(@NotNull Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f42805a = log;
    }

    public static /* synthetic */ Har copy$default(Har har, Log log, int i, Object obj) {
        if ((i & 1) != 0) {
            log = har.f42805a;
        }
        return har.copy(log);
    }

    @NotNull
    public final Log component1() {
        return this.f42805a;
    }

    @NotNull
    public final Har copy(@NotNull Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        return new Har(log);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Har) && Intrinsics.areEqual(this.f42805a, ((Har) obj).f42805a);
    }

    @NotNull
    public final Log getLog() {
        return this.f42805a;
    }

    public int hashCode() {
        return this.f42805a.hashCode();
    }

    @NotNull
    public String toString() {
        Log log = this.f42805a;
        return "Har(log=" + log + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Har(@NotNull List<HttpTransaction> transactions, @NotNull Creator creator) {
        this(new Log(transactions, creator));
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(creator, "creator");
    }
}
