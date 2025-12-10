package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser;
import java.util.Stack;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class InstructionSequenceBuilder extends Parser.AbstractSyntaxHandler {

    /* renamed from: c */
    public static final Pattern f60214c = Pattern.compile("[\\+\\-]?\\d+");

    /* renamed from: d */
    public static final Pattern f60215d = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");

    /* renamed from: a */
    public final InstructionSequence f60216a;

    /* renamed from: b */
    public final Stack f60217b;

    public InstructionSequenceBuilder() {
        InstructionSequence instructionSequence = new InstructionSequence();
        this.f60216a = instructionSequence;
        Stack stack = new Stack();
        this.f60217b = stack;
        stack.push(instructionSequence);
    }

    public static InstructionSequence parse(CharSequence charSequence) {
        InstructionSequenceBuilder instructionSequenceBuilder = new InstructionSequenceBuilder();
        Parser.parse(charSequence, instructionSequenceBuilder);
        return instructionSequenceBuilder.getInstructionSequence();
    }

    public static int parseInt(String str) {
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER)) {
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static float parseReal(String str) {
        return Float.parseFloat(str);
    }

    /* renamed from: a */
    public final InstructionSequence m32542a() {
        return (InstructionSequence) this.f60217b.peek();
    }

    /* renamed from: b */
    public final void m32541b(String str) {
        if ("{".equals(str)) {
            InstructionSequence instructionSequence = new InstructionSequence();
            m32542a().addProc(instructionSequence);
            this.f60217b.push(instructionSequence);
        } else if ("}".equals(str)) {
            this.f60217b.pop();
        } else if (f60214c.matcher(str).matches()) {
            m32542a().addInteger(parseInt(str));
        } else if (f60215d.matcher(str).matches()) {
            m32542a().addReal(parseReal(str));
        } else {
            m32542a().addName(str);
        }
    }

    public InstructionSequence getInstructionSequence() {
        return this.f60216a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
    public void token(CharSequence charSequence) {
        m32541b(charSequence.toString());
    }
}
