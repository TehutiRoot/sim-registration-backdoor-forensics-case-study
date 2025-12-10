package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser;
import java.util.Stack;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class InstructionSequenceBuilder extends Parser.AbstractSyntaxHandler {

    /* renamed from: c */
    public static final Pattern f60226c = Pattern.compile("[\\+\\-]?\\d+");

    /* renamed from: d */
    public static final Pattern f60227d = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");

    /* renamed from: a */
    public final InstructionSequence f60228a;

    /* renamed from: b */
    public final Stack f60229b;

    public InstructionSequenceBuilder() {
        InstructionSequence instructionSequence = new InstructionSequence();
        this.f60228a = instructionSequence;
        Stack stack = new Stack();
        this.f60229b = stack;
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
    public final InstructionSequence m32534a() {
        return (InstructionSequence) this.f60229b.peek();
    }

    /* renamed from: b */
    public final void m32533b(String str) {
        if ("{".equals(str)) {
            InstructionSequence instructionSequence = new InstructionSequence();
            m32534a().addProc(instructionSequence);
            this.f60229b.push(instructionSequence);
        } else if ("}".equals(str)) {
            this.f60229b.pop();
        } else if (f60226c.matcher(str).matches()) {
            m32534a().addInteger(parseInt(str));
        } else if (f60227d.matcher(str).matches()) {
            m32534a().addReal(parseReal(str));
        } else {
            m32534a().addName(str);
        }
    }

    public InstructionSequence getInstructionSequence() {
        return this.f60228a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
    public void token(CharSequence charSequence) {
        m32533b(charSequence.toString());
    }
}