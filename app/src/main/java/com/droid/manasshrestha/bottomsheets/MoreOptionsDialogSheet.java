package com.droid.manasshrestha.bottomsheets;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;

/**
 * {@link BottomSheetDialog} for options botton sheet
 */
public class MoreOptionsDialogSheet extends BottomSheetDialog {

    private static MoreOptionsDialogSheet moreOptionsDialogSheet;

    public static MoreOptionsDialogSheet getInstance(Context context) {

        if (moreOptionsDialogSheet == null)
            moreOptionsDialogSheet = new MoreOptionsDialogSheet(context);

        return moreOptionsDialogSheet;
    }

    public MoreOptionsDialogSheet(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bottom_sheet);
    }

    @Override
    public void show() {
        super.show();
    }
}
