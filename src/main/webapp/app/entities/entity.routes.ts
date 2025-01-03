import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'bussManagerApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'company',
    data: { pageTitle: 'bussManagerApp.company.home.title' },
    loadChildren: () => import('./company/company.routes'),
  },
  {
    path: 'transaction',
    data: { pageTitle: 'bussManagerApp.transaction.home.title' },
    loadChildren: () => import('./transaction/transaction.routes'),
  },
  {
    path: 'employee',
    data: { pageTitle: 'bussManagerApp.employee.home.title' },
    loadChildren: () => import('./employee/employee.routes'),
  },
  {
    path: 'customer',
    data: { pageTitle: 'bussManagerApp.customer.home.title' },
    loadChildren: () => import('./customer/customer.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
