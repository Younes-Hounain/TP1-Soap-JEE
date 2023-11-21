package webservice;

import lombok.*;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

}
