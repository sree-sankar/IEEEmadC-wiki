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

public class Lawers extends Fragment {
    private List<list_lawer> main_list;
    private RecyclerView.Adapter adapter;
    private EditText search;
    private final ViewGroup nullParent = null;
    private final ArrayList<list_lawer> mAllData= new ArrayList<>();

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
        View rootView = inflater.inflate(R.layout.fragment_lawers, nullParent);
        search = rootView.findViewById(R.id.edit);
        adapter = new AdapterLawer(main_list, getContext());
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
            search.setHint(R.string.searchlawers);
            search.setCursorVisible(false);
        }
        else {
            for (list_lawer wp : mAllData) {
                if (wp.getLocateLawers().toLowerCase(Locale.getDefault())
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
        main_list.add(new list_lawer( "Radhey Behari Lal", "Allahabad, 5788499611" ));
        main_list.add(new list_lawer( "Mohd. Yaqoob Siddiqui", "Hamirpur, 7053632769" ));
        main_list.add(new list_lawer( "Swami Prasad Singh", "Allahabad, 5448885794" ));
        main_list.add(new list_lawer( "Ram Narain Mehrotra", "Moradabad, 9520573695" ));
        main_list.add(new list_lawer( "Virendra Kumar Singh Chaudhary  ", "Moradabad, 3120101109" ));
        main_list.add(new list_lawer( "Roop Kishore Kakkar", "Lucknow, 3453388892" ));
        main_list.add(new list_lawer( "Surya Prakash Mishra", "Lucknow, 9289921395" ));
        main_list.add(new list_lawer( "Krishna Bahadur Sinha", "Farrukhabad, 5471902322" ));
        main_list.add(new list_lawer( "Kailash Narayan Shivpuri", "Pratapgarh, 6473800370" ));
        main_list.add(new list_lawer( "Ranbir Singh Gaur", "Dehradoon, 6372112811" ));
        main_list.add(new list_lawer( "Jaswant Prasad Mehta ", "Jhansi, 4893781623" ));
        main_list.add(new list_lawer( "Krishna Murari Pandey ", "Meerut, 8466123669" ));
        main_list.add(new list_lawer( "Bharat Singh Rathore ", "Shajahanpur, 4412191129" ));
        main_list.add(new list_lawer( "Ram Krishna Singh ", "Varanasi, 1409526404" ));
        main_list.add(new list_lawer( "Jai Dev Julie ", "Jhansi, 5723524048" ));
        main_list.add(new list_lawer( "Raj Krishan Saglu ", "Allahabad, 9990125890" ));
        main_list.add(new list_lawer( "Shiv Narain Gupta ", "Hamirpur, 6342004115" ));
        main_list.add(new list_lawer( "Shrish Chandra Kansal ", "Lucknow, 8332410020" ));
        main_list.add(new list_lawer( "Sushil Kumar Vidyarthi ", "Kanpur, 3435869938" ));
        main_list.add(new list_lawer( "Chinta Mani Pandey ", "Pratapgarh, 5281456628" ));
        main_list.add(new list_lawer( "Kashi Nath ", "Kerala, 3091583592" ));
        main_list.add(new list_lawer( "Nageshwar Nath Goyal ", "Meerut, 9588594626" ));
        main_list.add(new list_lawer( "Prayag Das ", "Dehradoon, 8785142086" ));
        main_list.add(new list_lawer( "Swaroop Kishore Tandon ", "Dehradoon, 9840728541" ));
        main_list.add(new list_lawer( "Shri Krishan Agrawal ", "Allahabad, 2031130674" ));

    }
}
