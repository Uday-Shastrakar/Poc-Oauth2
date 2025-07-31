import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { KeycloakService } from './app/services/keycloak';

const keycloakService = new KeycloakService();

keycloakService.init().then(() => {
  bootstrapApplication(App, appConfig)
    .catch((err) => console.error(err));
});
