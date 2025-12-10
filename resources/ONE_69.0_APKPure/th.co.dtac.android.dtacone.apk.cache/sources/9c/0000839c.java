package com.facebook.stetho.dumpapp;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.realm.CollectionUtils;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/* loaded from: classes3.dex */
public class GlobalOptions {
    public final Option optionHelp;
    public final Option optionListPlugins;
    public final Option optionProcess;
    public final Options options;

    public GlobalOptions() {
        Option option = new Option(OperatorName.CLOSE_PATH, "help", false, "Print this help");
        this.optionHelp = option;
        Option option2 = new Option(OperatorName.LINE_TO, CollectionUtils.LIST_TYPE, false, "List available plugins");
        this.optionListPlugins = option2;
        Option option3 = new Option("p", "process", true, "Specify target process");
        this.optionProcess = option3;
        Options options = new Options();
        this.options = options;
        options.addOption(option);
        options.addOption(option2);
        options.addOption(option3);
    }
}