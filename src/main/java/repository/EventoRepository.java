package repository;

import com.example.demo.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository  extends JpaRepository<Evento,String> {

}
