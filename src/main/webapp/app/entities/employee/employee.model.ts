import dayjs from 'dayjs/esm';
import { ICompany } from 'app/entities/company/company.model';

export interface IEmployee {
  id: number;
  firstName?: string | null;
  lastName?: string | null;
  email?: string | null;
  phoneNumber?: string | null;
  startDate?: dayjs.Dayjs | null;
  endDate?: dayjs.Dayjs | null;
  salary?: number | null;
  company?: Pick<ICompany, 'id'> | null;
}

export type NewEmployee = Omit<IEmployee, 'id'> & { id: null };
