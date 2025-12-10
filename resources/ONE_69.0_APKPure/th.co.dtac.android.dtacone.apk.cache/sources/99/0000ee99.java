package org.apache.commons.cli;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class AmbiguousOptionException extends UnrecognizedOptionException {
    private static final long serialVersionUID = 5829816121277947229L;
    private final Collection<String> matchingOptions;

    public AmbiguousOptionException(String str, Collection<String> collection) {
        super(createMessage(str, collection), str);
        this.matchingOptions = collection;
    }

    private static String createMessage(String str, Collection<String> collection) {
        StringBuilder sb = new StringBuilder("Ambiguous option: '");
        sb.append(str);
        sb.append("'  (could be: ");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sb.append(it.next());
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public Collection<String> getMatchingOptions() {
        return this.matchingOptions;
    }
}