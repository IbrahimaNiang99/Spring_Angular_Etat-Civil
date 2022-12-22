import {Time} from "@angular/common";

export class Personne{
  id: number | undefined;
  prenom: string | undefined;
  nom: string | undefined;
  profession: string | undefined;
  CNI: string | undefined;
  sexe: string | undefined;
  adresse: string | undefined;
  lieuNaissance: string | undefined;
  dateNaissance: Date | undefined;
  heureNaissance : Time | undefined;
}
