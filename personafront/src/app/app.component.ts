import { elementEventFullName } from '@angular/compiler/src/view_compiler/view_compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PersonasService } from './services/personas/personas.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  personaForm!: FormGroup;
  personaFormEditar!: FormGroup;
  personas: any;

  constructor(
    public fb: FormBuilder,
    public personaService: PersonasService,


  ) {
  }
  ngOnInit(): void {

    this.personaForm = this.fb.group({

      cedula: ['', Validators.required],
      nombre: ['', Validators.required],
      fecha_nacimiento: ['', Validators.required],
    });

    this.getPersonas();

  }

  getPersonas(): void {
    this.personaService.getAllPersonas().subscribe(resp => {
      this.personas = resp;
    },
      error => { console.error(error) });
  }

  guardar(): void {
    this.personaService.addPersona(this.personaForm.value).subscribe(resp => {
      this.getPersonas();
    },
      error => { console.error(error) });


  }

  editar(): void {
    this.personaService.updatePersona(this.personaForm.value).subscribe(resp => {
      console.log(this.personaForm.value)
      this.getPersonas()
    },
      error => { console.error(error) });
  }

  eliminar(cedula: string): void {
    const documento = Number(cedula);
    this.personaService.deletePersona(documento).subscribe(resp => {

      this.personas = this.personas.filter((persona: any) => persona.cedula !== cedula);
    },
      error => { console.error(error) });
  }

  ordenar(claveDeOrdenamiento: "cedula" | "nombre" | "fecha_nacimiento"): void {
    //nombre del campo por el que va a ordenar

    const personasSort = this.personas.sort(function (a: any, b: any) {
      if (a[claveDeOrdenamiento] > b[claveDeOrdenamiento]) {
        return 1;
      }
      if (a[claveDeOrdenamiento] < b[claveDeOrdenamiento]) {
        return -1;
      }
      // a must be equal to b
      return 0;
    });
    console.log(personasSort)
  }

}
