package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.text.Regex;

/* renamed from: IE1 */
/* loaded from: classes6.dex */
public final class IE1 {

    /* renamed from: a */
    public static final IE1 f2448a = new IE1();

    /* renamed from: b */
    public static final Regex f2449b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f2449b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + (CoreConstants.LEFT_PARENTHESIS_CHAR + "(\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[pP][+-]?(\\p{Digit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
