import { appModule } from './app/main.module';

import './style.scss';
import "./app/angularUtils/dirPagination";
import "angucomplete-alt";



angular.bootstrap(document.body, [appModule], { strictDi: true });
