import {Registre} from "../../Registre";
import {Personne} from "../../Personne";
import {Declarant} from "../../Declarant";
import {FormationSanitaire} from "../../formation-sanitaire/FormationSanitaire";
import {Jugement} from "./Jugement";

export class Naissance {
  id: number | undefined;
  dateDeclaration: Date | undefined;
  typeDeclaration: String | undefined;
  numActe: number | undefined;
  registre: Registre = new Registre();
  pere: Personne=new Personne();
  mere: Personne=new Personne();
  declarant: Declarant = new Declarant();
  declare : Personne=new Personne();
  jugement: Jugement = new Jugement();
  formaSanitaire:FormationSanitaire = new FormationSanitaire();
}
