import {Personne} from "../Personne";
import {Registre} from "../Registre";
import {Temoin} from "./Temoin";

export class Mariage {
  id: number | undefined;
  dateDeclaration: Date | undefined;
  numActe: number | undefined;
  registre: Registre | undefined;
  regime: string | undefined;
  option: string | undefined;
  coutume : string | undefined;
  dot:string  | undefined;
  epoux:Personne = new Personne;
  epouse:Personne = new Personne;
  pereEpoux:Personne = new Personne;
  mereEpoux:Personne = new Personne;
  pereEpouse:Personne = new Personne;
  mereEpouse:Personne = new Personne;
  temoinEpoux: Temoin = new Temoin;
  temoinEpouse: Temoin = new Temoin;

}
