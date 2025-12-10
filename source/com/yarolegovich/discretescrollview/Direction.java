package com.yarolegovich.discretescrollview;

/* loaded from: classes5.dex */
enum Direction {
    START { // from class: com.yarolegovich.discretescrollview.Direction.1
        @Override // com.yarolegovich.discretescrollview.Direction
        public int applyTo(int i) {
            return i * (-1);
        }

        @Override // com.yarolegovich.discretescrollview.Direction
        public boolean sameAs(int i) {
            return i < 0;
        }
    },
    END { // from class: com.yarolegovich.discretescrollview.Direction.2
        @Override // com.yarolegovich.discretescrollview.Direction
        public int applyTo(int i) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.Direction
        public boolean sameAs(int i) {
            return i > 0;
        }
    };

    public static Direction fromDelta(int i) {
        if (i > 0) {
            return END;
        }
        return START;
    }

    public abstract int applyTo(int i);

    public abstract boolean sameAs(int i);
}
