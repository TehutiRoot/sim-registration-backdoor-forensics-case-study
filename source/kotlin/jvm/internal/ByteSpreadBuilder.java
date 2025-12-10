package kotlin.jvm.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28850d2 = {"Lkotlin/jvm/internal/ByteSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "size", "<init>", "(I)V", "getSize", "([B)I", "", "value", "", ProductAction.ACTION_ADD, "(B)V", "toArray", "()[B", "d", "[B", "values", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ByteSpreadBuilder extends PrimitiveSpreadBuilder<byte[]> {

    /* renamed from: d */
    public final byte[] f68262d;

    public ByteSpreadBuilder(int i) {
        super(i);
        this.f68262d = new byte[i];
    }

    public final void add(byte b) {
        byte[] bArr = this.f68262d;
        int position = getPosition();
        setPosition(position + 1);
        bArr[position] = b;
    }

    @NotNull
    public final byte[] toArray() {
        return toArray(this.f68262d, new byte[size()]);
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }
}
