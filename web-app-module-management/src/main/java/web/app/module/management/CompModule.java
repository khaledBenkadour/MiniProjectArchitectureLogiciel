package web.app.module.management;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import web.app.module.management.Module;

import javax.persistence.*;

@Entity
@Table(name = "Comp_Module")
@Setter @Getter @NoArgsConstructor @ToString
public class CompModule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int volHorCour;
    private int volHorTd;
    private int volHorTp;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    public CompModule(int volHorCour, int volHorTd, int volHorTp) {
        this.volHorCour = volHorCour;
        this.volHorTd = volHorTd;
        this.volHorTp = volHorTp;
    }
}
