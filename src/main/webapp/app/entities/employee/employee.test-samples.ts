import dayjs from 'dayjs/esm';

import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 8899,
  firstName: 'Heloísa',
  lastName: 'Melo',
};

export const sampleWithPartialData: IEmployee = {
  id: 10051,
  firstName: 'Théo',
  lastName: 'Melo',
  email: 'Natalia_Batista@live.com',
  phoneNumber: 'gratefully',
  startDate: dayjs('2025-01-03'),
  endDate: dayjs('2025-01-02'),
};

export const sampleWithFullData: IEmployee = {
  id: 19019,
  firstName: 'Ofélia',
  lastName: 'Moreira',
  email: 'Maite_Albuquerque47@live.com',
  phoneNumber: 'boo cauliflower',
  startDate: dayjs('2025-01-03'),
  endDate: dayjs('2025-01-02'),
  salary: 24282.21,
};

export const sampleWithNewData: NewEmployee = {
  firstName: 'Cauã',
  lastName: 'Pereira',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
