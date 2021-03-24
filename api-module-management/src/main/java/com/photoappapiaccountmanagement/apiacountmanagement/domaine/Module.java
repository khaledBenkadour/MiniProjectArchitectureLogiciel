package com.photoappapiaccountmanagement.apiacountmanagement.domaine;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "module")
@Setter @Getter @NoArgsConstructor @ToString
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long module_id;
    private String nomModule;
    private int coefficient;

    public Module(String nomModule, int coefficient, int volHoCour, int volHoTd, int volHoTp) {
        this.nomModule = nomModule;
        this.coefficient = coefficient;
    }
}
