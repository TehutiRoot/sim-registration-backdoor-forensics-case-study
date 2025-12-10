package com.chuckerteam.chucker.internal.p010ui.transaction;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.chuckerteam.chucker.R;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "", "", "icon", TypedValues.Custom.S_COLOR, "<init>", "(II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIcon", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getColor", "Http", "Https", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Http;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Https;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.ProtocolResources */
/* loaded from: classes3.dex */
public abstract class ProtocolResources {

    /* renamed from: a */
    public final int f43000a;

    /* renamed from: b */
    public final int f43001b;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Http;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.ProtocolResources$Http */
    /* loaded from: classes3.dex */
    public static final class Http extends ProtocolResources {
        public Http() {
            super(R.drawable.chucker_ic_http, R.color.chucker_color_error, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources$Https;", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.ProtocolResources$Https */
    /* loaded from: classes3.dex */
    public static final class Https extends ProtocolResources {
        public Https() {
            super(R.drawable.chucker_ic_https, R.color.chucker_color_primary, null);
        }
    }

    public /* synthetic */ ProtocolResources(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public final int getColor() {
        return this.f43001b;
    }

    public final int getIcon() {
        return this.f43000a;
    }

    public ProtocolResources(int i, int i2) {
        this.f43000a = i;
        this.f43001b = i2;
    }
}
