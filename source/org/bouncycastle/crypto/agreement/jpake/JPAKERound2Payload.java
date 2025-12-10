package org.bouncycastle.crypto.agreement.jpake;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public class JPAKERound2Payload {

    /* renamed from: a */
    private final BigInteger f74758a;
    private final BigInteger[] knowledgeProofForX2s;
    private final String participantId;

    public JPAKERound2Payload(String str, BigInteger bigInteger, BigInteger[] bigIntegerArr) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(bigInteger, PDPageLabelRange.STYLE_LETTERS_LOWER);
        JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX2s");
        this.participantId = str;
        this.f74758a = bigInteger;
        this.knowledgeProofForX2s = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger getA() {
        return this.f74758a;
    }

    public BigInteger[] getKnowledgeProofForX2s() {
        BigInteger[] bigIntegerArr = this.knowledgeProofForX2s;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
