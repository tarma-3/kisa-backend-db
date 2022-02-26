package team.exploding.kisabackenddb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "MRC_SENTENCE")
public class MRCSentence {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    Long id;
    @OneToMany(mappedBy = "mrcSentence",fetch = FetchType.LAZY)
    List<STRConstant> strings;
    @OneToMany(mappedBy = "mrcSentence",fetch = FetchType.LAZY)
    List<MRCAnswerable> answerables;
}
