import dayjs from 'dayjs/esm';

import { ICustomer, NewCustomer } from './customer.model';

export const sampleWithRequiredData: ICustomer = {
  id: 3366,
  name: 'slake splurge',
  contractStartDate: dayjs('2025-01-03'),
};

export const sampleWithPartialData: ICustomer = {
  id: 29642,
  name: 'perfumed amidst',
  contractStartDate: dayjs('2025-01-03'),
};

export const sampleWithFullData: ICustomer = {
  id: 4149,
  name: 'where known',
  contractStartDate: dayjs('2025-01-02'),
  contractEndDate: dayjs('2025-01-03'),
};

export const sampleWithNewData: NewCustomer = {
  name: 'thyme inasmuch',
  contractStartDate: dayjs('2025-01-02'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
