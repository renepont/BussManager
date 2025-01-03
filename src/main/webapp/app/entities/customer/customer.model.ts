import dayjs from 'dayjs/esm';
import { ICompany } from 'app/entities/company/company.model';

export interface ICustomer {
  id: number;
  name?: string | null;
  contractStartDate?: dayjs.Dayjs | null;
  contractEndDate?: dayjs.Dayjs | null;
  company?: Pick<ICompany, 'id'> | null;
}

export type NewCustomer = Omit<ICustomer, 'id'> & { id: null };
