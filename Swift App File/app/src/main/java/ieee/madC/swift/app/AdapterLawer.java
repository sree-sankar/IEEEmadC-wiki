package ieee.madC.swift.app;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

public class AdapterLawer extends RecyclerView.Adapter<AdapterLawer.MyViewHolder> {
    private final List<list_lawer> lawersList;
    private final Context context;

    public AdapterLawer(List<list_lawer> lawersList, Context applicationContext) {
        this.lawersList = lawersList;
        this.context = applicationContext;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_lawers,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        final list_lawer list_lawer = lawersList.get(i);
        myViewHolder.lawer.setText(list_lawer.lawers);
        myViewHolder.lawersLocation.setText(list_lawer.locateLawers);


    }

    @Override
    public int getItemCount() {

        return  lawersList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView lawer,lawersLocation;
        final LinearLayout layout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            lawer = itemView.findViewById(R.id.lawers);
            lawersLocation = itemView.findViewById(R.id.locateLawer);
            layout = itemView.findViewById(R.id.lawerLayout);


        }

    }

}
