package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.text.Regex;

/* renamed from: FF1 */
/* loaded from: classes6.dex */
public final class FF1 {

    /* renamed from: a */
    public static final FF1 f1629a = new FF1();

    /* renamed from: b */
    public static final Regex f1630b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f1630b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + (CoreConstants.LEFT_PARENTHESIS_CHAR + "(\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[pP][+-]?(\\p{Digit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[fFdD]?))[\\x00-\\x20]*");
    }
}