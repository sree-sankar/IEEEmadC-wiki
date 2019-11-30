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

public class Court extends Fragment {
    private List<list_court> main_list;
    private RecyclerView.Adapter adapter;
    private EditText search;
    private final ViewGroup nullParent = null;
    private final ArrayList<list_court> mAllData= new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setRetainInstance(true);
        court();
    }

    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_court, nullParent);
        search = rootView.findViewById(R.id.edit);
        adapter = new AdapterCourt(main_list, getContext());
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
            search.setHint(R.string.searchcourt);
            search.setCursorVisible(false);
        }
        else {
            for (list_court wp : mAllData) {
                if (wp.getLocateCourt().toLowerCase(Locale.getDefault())
                        .contains(query)) {
                    main_list.add(wp);
                    search.setHint("");
                    search.setCursorVisible(true);

                }

            }

        }
        adapter.notifyDataSetChanged();
    }

    private void court() {
        main_list = new ArrayList<>();
        main_list.add(new list_court( "Agra High Court", "Fatehabad"));
        main_list.add(new list_court( "Aligarh District Court", "Atrauli"));
        main_list.add(new list_court( "Allahabad District Court", "Atrauli"));
        main_list.add(new list_court( "Akbarpur District Court", "Tanda"));
        main_list.add(new list_court( "Amethi High Court", "Atrauli"));
        main_list.add(new list_court( "Amroha District Court", "Hasanpur"));
        main_list.add(new list_court( "Auraiya High Court", "Bidhuna"));
        main_list.add(new list_court( "Azamgarh District Court", "Utraula"));
        main_list.add(new list_court( "Baghpat District Court", "Bidhuna"));
        main_list.add(new list_court( "Bahraich District Court", "Bidhuna"));
        main_list.add(new list_court( "Ballia District Court", "Bidhuna"));
        main_list.add(new list_court( "Balrampur District Court", "Utraula"));
        main_list.add(new list_court( "Banda High Court", "Atarra"));
        main_list.add(new list_court( "Barabanki District Court", "Haidergarh"));
        main_list.add(new list_court( "Bareilly District Court", "Faridpur"));
        main_list.add(new list_court( "Basti District Court", "Khalilabad"));
        main_list.add(new list_court( "Gyanpur District Court", "Utraula"));
        main_list.add(new list_court( "Bijnor District Court", "Nazibabad"));
        main_list.add(new list_court( "Budaun District Court", "Sahaswan"));
        main_list.add(new list_court( "Bulandshahar High Court", "Khurja"));
        main_list.add(new list_court( "Chandauli District Court", "Chakia"));
        main_list.add(new list_court( "Chitrakoot High Court", "Mau"));
        main_list.add(new list_court( "Deoria District Court", "Saidpur"));
        main_list.add(new list_court( "Etah District Court", "Jalesar"));
        main_list.add(new list_court( "Faizabad District Court", "Saidpur"));
        main_list.add(new list_court( "Farukkhabad District Court", "Kayamganj"));
        main_list.add(new list_court( "Fatehpur District Court", "Khaga"));
        main_list.add(new list_court( "Firozabad District Court", "Jasrana"));
        main_list.add(new list_court( "Gautambuddha District Court", "Jewar"));
        main_list.add(new list_court( "Ghaziabad High Court", "Chhibramau"));
        main_list.add(new list_court( "Ghazipur District Court", "Saidpur"));
        main_list.add(new list_court( "Gonda District Court", "Sadabad"));
        main_list.add(new list_court( "Gorakhpur District Court", "Bansgaon"));
        main_list.add(new list_court( "Hamirpur District Court", "Maudaha"));
        main_list.add(new list_court( "Hapur High Court", "Garhmukteshwar"));
        main_list.add(new list_court( "Hardoi District Court", "Chhibramau"));
        main_list.add(new list_court( "Hathras District Court", "Sadabad"));
        main_list.add(new list_court( "Jalaun at Orai District Court", "Konch"));
        main_list.add(new list_court( "Jaunpur District Court", "Sahaganj"));
        main_list.add(new list_court( "Jhansi District Court", "Garotha"));
        main_list.add(new list_court( "Kannauj District Court", "Chhibramau"));
        main_list.add(new list_court( "Kanpur Nagar District Court", "Chhibramau"));
        main_list.add(new list_court( "Kasganj District Court", "Patiyali"));
        main_list.add(new list_court( "Kaushambi District Court", "Pharenda"));
        main_list.add(new list_court( "Kushi Nagar  District Court", "Kasia"));
        main_list.add(new list_court( "Lakhimpur Kheri District Court", "Mohammadi"));
        main_list.add(new list_court( "Lalitpur District Court", "Mehrauni"));
        main_list.add(new list_court( "Lucknow District Court", "Malihabad"));
        main_list.add(new list_court( "Maharajganj District Court", "Pharenda"));
        main_list.add(new list_court( "Mahoba High Court", "Charkhari"));
        main_list.add(new list_court( "Mainpuri District Court", "Mehrauni"));
        main_list.add(new list_court( "Mathura District Court", "Chhata"));
        main_list.add(new list_court( "Mau High Court", "Mohammadabad"));
        main_list.add(new list_court( "Meerut District Court", "Sardhana"));
        main_list.add(new list_court( "Mirzapur", "Chunar"));
        main_list.add(new list_court( "Moradabad High Court", "Thakurdwara"));
        main_list.add(new list_court( "Muzaffarnagar District Court", "Kairana"));
        main_list.add(new list_court( "Pilibhit District Court", "Bisalpur"));
        main_list.add(new list_court( "Pratapgarh District Court", "Lalganj Ajhara"));
        main_list.add(new list_court( "Raebareli District Court", "Dalmau"));
        main_list.add(new list_court( "Rampur District Court", "Jalalabad"));


    }
}
