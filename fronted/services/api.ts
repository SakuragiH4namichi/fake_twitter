import axios,{ AxiosResponse } from 'axios';
import { SigninInputs,LoginResponse } from '../types/auth';

const api = axios.create({
    baseURL: 'http://localhost:8080/api',
    withCredentials: true,
});

export const login = async (data: SigninInputs): Promise<AxiosResponse<LoginResponse>> => {
    return await api.post<LoginResponse>('/login', data);
}