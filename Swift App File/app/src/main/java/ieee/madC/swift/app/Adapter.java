package ieee.madC.swift.app;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private final List<list_ipc> ipcList;
    private final Context context;
    public Adapter(List<list_ipc> main_list, Context applicationContext) {
        this.ipcList = main_list;
        this.context = applicationContext;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_ipc,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        final list_ipc list_ipc = ipcList.get(i);
        myViewHolder.ipc.setText(list_ipc.name);
        myViewHolder.key.setText(list_ipc.keyword);
        myViewHolder.description.setText(list_ipc.description);

    }

    @Override
    public int getItemCount() {

        return  ipcList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView ipc,key,description;
        final LinearLayout layout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ipc = itemView.findViewById(R.id.ipc_sections);
            key = itemView.findViewById(R.id.keyword);
            description = itemView.findViewById(R.id.details);

            layout = itemView.findViewById(R.id.expand);
        }

    }

}
