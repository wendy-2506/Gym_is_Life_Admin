package com.example.gym_is_life_admin.Inicio.AdapterUsuario

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gym_is_life_admin.Inicio.ModelUsuario.Clases
import com.example.gym_is_life_admin.R

class ClasesAdapter(private var lstClases: List<Clases>)
    : RecyclerView.Adapter<ClasesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvDisciplina: TextView = itemView.findViewById(R.id.tvDisciplinaU)
        val tvInstructor: TextView = itemView.findViewById(R.id.tvInstructorU)
        val tvHorario: TextView = itemView.findViewById(R.id.tvHorarioU)
        val tvNivel: TextView = itemView.findViewById(R.id.tvNivelU)
        val tvAforo: TextView = itemView.findViewById(R.id.tvAforoU)
        val tvSalon: TextView = itemView.findViewById(R.id.tvSalonU)
        val btnInscribirse: Button = itemView.findViewById(R.id.btnInscribirse)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClasesAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_clases,parent,false))
    }

    override fun onBindViewHolder(holder: ClasesAdapter.ViewHolder, position: Int) {
        val itemClases = lstClases[position]
        holder.tvDisciplina.text = itemClases.Disciplina
        holder.tvInstructor.text = itemClases.Instructor
        holder.tvNivel.text = itemClases.Nivel
        holder.tvHorario.text = itemClases.Horario
        holder.tvSalon.text = itemClases.Salon
        holder.tvAforo.text = itemClases.Aforo.toString()
        holder.btnInscribirse.setOnClickListener{
        }

    }

    override fun getItemCount(): Int {
        return lstClases.size
    }


}
