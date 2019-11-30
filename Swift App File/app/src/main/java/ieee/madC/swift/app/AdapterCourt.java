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

public class AdapterCourt extends RecyclerView.Adapter<AdapterCourt.MyViewHolder> {
    private final List<list_court> courtList;
    private final Context context;
    public AdapterCourt(List<list_court> courtList, Context applicationContext) {
        this.courtList = courtList;
        this.context = applicationContext;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_court,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        final list_court list_court = courtList.get(i);
        myViewHolder.court.setText(list_court.court);
        myViewHolder.courtLocation.setText(list_court.locateCourt);

    }

    @Override
    public int getItemCount() {

        return  courtList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView court,courtLocation;
        final LinearLayout layout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            court = itemView.findViewById(R.id.court);
            courtLocation = itemView.findViewById(R.id.location);
            layout = itemView.findViewById(R.id.courtLayout);
        }

    }

}
