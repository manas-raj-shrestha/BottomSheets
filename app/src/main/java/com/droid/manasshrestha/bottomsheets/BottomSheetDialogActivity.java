package com.droid.manasshrestha.bottomsheets;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * show implementation of bottom sheet dialog
 */
public class BottomSheetDialogActivity extends AppCompatActivity implements ContactClickListener {

    private MoreOptionsDialogSheet bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_sheet);

        RecyclerView recyclerView
                = (RecyclerView) findViewById(R.id.rv_contacts);

        bottomSheetDialog = MoreOptionsDialogSheet.getInstance(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(BottomSheetDialogActivity.this));
        recyclerView.setAdapter(new ContactsAdapter(BottomSheetDialogActivity.this, DataProvider.getContacts()));
    }

    @Override
    public void OnContactClicked(Contact contact) {
        bottomSheetDialog.show();
    }
}
