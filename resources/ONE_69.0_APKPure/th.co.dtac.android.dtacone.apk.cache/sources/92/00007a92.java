package ch.qos.logback.core.pattern.parser;

/* loaded from: classes.dex */
public class CompositeNode extends SimpleKeywordNode {

    /* renamed from: f */
    public Node f39983f;

    public CompositeNode(String str) {
        super(2, str);
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof CompositeNode)) {
            Node node = this.f39983f;
            Node node2 = ((CompositeNode) obj).f39983f;
            return node != null ? node.equals(node2) : node2 == null;
        }
        return false;
    }

    public Node getChildNode() {
        return this.f39983f;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setChildNode(Node node) {
        this.f39983f = node;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f39983f != null) {
            str = "CompositeNode(" + this.f39983f + ")";
        } else {
            str = "CompositeNode(no child)";
        }
        sb.append(str);
        sb.append(m51427a());
        return sb.toString();
    }
}