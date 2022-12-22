import {Personne} from "../Personne";
import {Declarant} from "../Declarant";
import {Registre} from "../Registre";
import {FormationSanitaire} from "../formation-sanitaire/FormationSanitaire";


export class Deces{
  id: number | undefined;
  dateDeclaration: Date | undefined;
  numActe: number | undefined;
  registre: Registre | undefined;
  dateDeces: Date | undefined;
  pere: Personne=new Personne();
  mere: Personne=new Personne();
  declarant:Declarant = new Declarant();
  defunt: Personne=new Personne();
  formaSanitaire:FormationSanitaire | undefined;

}
