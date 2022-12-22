import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { AccueilComponent } from './home/accueil/accueil.component';
import { RouterModule, Routes } from "@angular/router";
import { DeclarationDecesComponent } from './home/deces/declaration-deces/declaration-deces.component';
import { ListeDecesComponent } from './home/deces/liste-deces/liste-deces.component';
import { ListeNaissanceComponent } from './home/naissance/liste-naissance/liste-naissance.component';
import { DeclarationNaissanceComponent } from './home/naissance/declaration-naissance/declaration-naissance.component';
import { DeclarationMariageComponent } from './home/mariage/declaration-mariage/declaration-mariage.component';
import { ListeMariageComponent } from './home/mariage/liste-mariage/liste-mariage.component';
import { ListeUtilisateurComponent } from './home/utilisateur/liste-utilisateur/liste-utilisateur.component';
import { AjoutUtilisateurComponent } from './home/utilisateur/ajout-utilisateur/ajout-utilisateur.component';
import {MatStepperModule} from "@angular/material/stepper";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MdbFormsModule} from "mdb-angular-ui-kit/forms";
import {MatInputModule} from "@angular/material/input";
import {MatDialogModule} from "@angular/material/dialog";
import {MatSelectModule} from "@angular/material/select";
import {MatCheckboxModule} from "@angular/material/checkbox";
import {MatCardModule} from "@angular/material/card";
import { PdfMariageComponent } from './home/mariage/pdf-mariage/pdf-mariage.component';
import { PdfActeNaissanceComponent } from './home/naissance/pdf-acte-naissance/pdf-acte-naissance.component';
import { PdfBulletinNaissanceComponent } from './home/naissance/pdf-bulletin-naissance/pdf-bulletin-naissance.component';
import { PdfExtraitNaissanceComponent } from './home/naissance/pdf-extrait-naissance/pdf-extrait-naissance.component';
import {ImpressionNaissanceComponent} from "./home/naissance/impression-naissance/impression-naissance.component";
import { ImpressionMariageComponent } from './home/mariage/impression-mariage/impression-mariage.component';
import { ImpressionDecesComponent } from './home/deces/impression-deces/impression-deces.component';
import { PdfDecesComponent } from './home/deces/pdf-deces/pdf-deces.component';
import {NgxPrintModule} from "ngx-print";
import { FormationSanitaireComponent } from './home/formation-sanitaire/formation-sanitaire.component';
import { CentreComponent } from './home/centre/centre.component';
import { InfosDecesComponent } from './home/deces/infos-deces/infos-deces.component';
import { RegistreComponent } from './home/registre/registre.component';
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {MatRadioModule} from "@angular/material/radio";
import { DetailsNaissanceComponent } from './home/naissance/details-naissance/details-naissance.component';

const routes: Routes = [
  {path: "home", component: HomeComponent,
    children: [
      { path: "", component: AccueilComponent },
      { path: "accueil", component: AccueilComponent },

      { path:"naissance/declaration", component: DeclarationNaissanceComponent},
      { path:"naissance/liste", component: ListeNaissanceComponent},
      { path:"naissance/details/:id", component: DetailsNaissanceComponent},
      { path:"naissance/impression", component: ImpressionNaissanceComponent},
      { path:"naissance/pdfActe/:id", component: PdfActeNaissanceComponent},
      { path:"naissance/pdfExtrait/:id", component: PdfExtraitNaissanceComponent},
      { path:"naissance/pdfBulletin/:id", component: PdfBulletinNaissanceComponent},

      { path:"mariage/declaration", component: DeclarationMariageComponent},
      { path:"mariage/liste", component: ListeMariageComponent},
      { path:"mariage/impression", component: ImpressionMariageComponent},
      { path:"mariage/pdfMariage", component: PdfMariageComponent},

      { path:"deces/declaration", component: DeclarationDecesComponent},
      { path:"deces/liste", component: ListeDecesComponent},
      { path:"deces/impression", component: ImpressionDecesComponent},
      { path:"deces/pdfDeces", component: PdfDecesComponent},
      { path:"deces/info/:id", component: InfosDecesComponent},

      { path:"utilisateur/ajout", component: AjoutUtilisateurComponent},
      { path:"utilisateur/liste", component: ListeUtilisateurComponent},

      { path:"formationSanitaire", component: FormationSanitaireComponent},
      { path:"centre", component: CentreComponent},
    ]
  }

];



@NgModule({
  declarations: [
    HomeComponent,
    AccueilComponent,
    DeclarationDecesComponent,
    ListeDecesComponent,
    ListeNaissanceComponent,
    DeclarationNaissanceComponent,
    DeclarationMariageComponent,
    ListeMariageComponent,
    ListeUtilisateurComponent,
    AjoutUtilisateurComponent,
    ImpressionNaissanceComponent,
    PdfMariageComponent,
    PdfActeNaissanceComponent,
    PdfBulletinNaissanceComponent,
    PdfExtraitNaissanceComponent,
    ImpressionMariageComponent,
    ImpressionDecesComponent,
    PdfDecesComponent,
    FormationSanitaireComponent,
    CentreComponent,
    InfosDecesComponent,
    RegistreComponent,
    DetailsNaissanceComponent,
  ],
    imports: [
        CommonModule,
        RouterModule.forChild(routes),
        MatStepperModule,
        ReactiveFormsModule,
        MatFormFieldModule,
        MdbFormsModule,
        MatInputModule,
        MatDialogModule,
        MatSelectModule,
        MatCheckboxModule,
        MatCardModule,
        NgxPrintModule,
        FormsModule,
        Ng2SearchPipeModule,
        MatRadioModule
    ]
})
export class DashboardModule {}
