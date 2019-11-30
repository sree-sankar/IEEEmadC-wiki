package ieee.madC.swift.app;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.support.v4.app.Fragment;
import android.widget.*;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IPC extends Fragment {
    private List<list_ipc> main_list;
    private RecyclerView.Adapter adapter;
    private EditText search;
    private final ViewGroup nullParent = null;
    private final ArrayList<list_ipc> mAllData= new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setRetainInstance(true);
        ipcsection();
    }

    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ipc, nullParent);
        search = rootView.findViewById(R.id.edit);
        adapter = new Adapter(main_list, getContext());
        RecyclerView recyclerView = rootView.findViewById(R.id.recylcer);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search.setCursorVisible(true);

            }
        });
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String query = search.getText().toString().toLowerCase(Locale.getDefault());
                filter(query);

            }
        });
        mAllData.addAll(main_list);
        return rootView;
    }

    private void filter(String query)
    {

        query = query.toLowerCase(Locale.getDefault());
        main_list.clear();
        if(query.length()== 0) {
            main_list.addAll(mAllData);
            search.setHint(R.string.searchipc);
            search.setCursorVisible(false);
        }
        else {
            for (list_ipc wp : mAllData) {
                if (wp.getKeyword().toLowerCase(Locale.getDefault())
                        .contains(query)) {
                    main_list.add(wp);
                    search.setHint("");
                    search.setCursorVisible(true);

                }

            }

        }
        adapter.notifyDataSetChanged();
    }

    private void ipcsection() {
        main_list = new ArrayList<>();
        main_list.add(new list_ipc( "IPC 24", getResources().getString(R.string.section_24_keywords), getResources().getString(R.string.section_24_description)));
        main_list.add(new list_ipc( "IPC 25", getResources().getString(R.string.section_25_keywords), getResources().getString(R.string.section_25_description)));
        main_list.add(new list_ipc( "IPC 28", getResources().getString(R.string.section_28_keywords), getResources().getString(R.string.section_28_description)));
        main_list.add(new list_ipc( "IPC 46", getResources().getString(R.string.section_46_keywords), getResources().getString(R.string.section_46_description)));
        main_list.add(new list_ipc( "IPC 54", getResources().getString(R.string.section_54_keywords), getResources().getString(R.string.section_54_description)));
        main_list.add(new list_ipc( "IPC 302", getResources().getString(R.string.section_302_keywords), getResources().getString(R.string.section_302_description)));
        main_list.add(new list_ipc( "IPC 303", getResources().getString(R.string.section_303_keywords), getResources().getString(R.string.section_303_description)));
        main_list.add(new list_ipc( "IPC 304A", getResources().getString(R.string.section_304A_keywords), getResources().getString(R.string.section_304A_description)));
        main_list.add(new list_ipc( "IPC 121", getResources().getString(R.string.section_121_keywords), getResources().getString(R.string.section_121_description)));
        main_list.add(new list_ipc( "IPC 131", getResources().getString(R.string.section_131_keywords), getResources().getString(R.string.section_131_description)));
        main_list.add(new list_ipc( "IPC 228", getResources().getString(R.string.section_228_keywords), getResources().getString(R.string.section_228_description)));
        main_list.add(new list_ipc( "IPC 272", getResources().getString(R.string.section_272_keywords), getResources().getString(R.string.section_272_description)));
        main_list.add(new list_ipc( "IPC 283", getResources().getString(R.string.section_283_keywords), getResources().getString(R.string.section_283_description)));
        main_list.add(new list_ipc( "IPC 295", getResources().getString(R.string.section_295_keywords), getResources().getString(R.string.section_295_description)));
        main_list.add(new list_ipc( "IPC 295A", getResources().getString(R.string.section_295A_keywords), getResources().getString(R.string.section_295A_description)));
        main_list.add(new list_ipc( "IPC 4", getResources().getString(R.string.section_4_keywords), getResources().getString(R.string.section_4_description)));
        main_list.add(new list_ipc( "IPC 376", getResources().getString(R.string.section_376_keywords), getResources().getString(R.string.section_376_description)));
        main_list.add(new list_ipc( "IPC 395", getResources().getString(R.string.section_395_keywords), getResources().getString(R.string.section_395_description)));
        main_list.add(new list_ipc( "IPC 489C", getResources().getString(R.string.section_489_keywords), getResources().getString(R.string.section_489_description)));
        main_list.add(new list_ipc( "IPC 496", getResources().getString(R.string.section_496_keywords), getResources().getString(R.string.section_496_description)));
        main_list.add(new list_ipc( "IPC 498", getResources().getString(R.string.section_498_keywords), getResources().getString(R.string.section_498_description)));
        main_list.add(new list_ipc( "IPC 411", getResources().getString(R.string.section_411_keywords), getResources().getString(R.string.section_411_description)));
        main_list.add(new list_ipc( "IPC 269", getResources().getString(R.string.section_269_keywords), getResources().getString(R.string.section_269_description)));
        main_list.add(new list_ipc( "IPC 120B", getResources().getString(R.string.section_120B_keywords), getResources().getString(R.string.section_120B_description)));
        main_list.add(new list_ipc( "IPC 203", getResources().getString(R.string.section_203_keywords), getResources().getString(R.string.section_203_description)));
        main_list.add(new list_ipc( "IPC 223", getResources().getString(R.string.section_223_keywords), getResources().getString(R.string.section_223_description)));
    }
}
